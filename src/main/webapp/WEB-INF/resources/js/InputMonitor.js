$(document).ready(function () {
    Rx.Observable.fromEvent(document.getElementById("name"), "keyup")
                 // .throttleTime(1000)
                 .flatMap((e) => getMergedObservable(e))
                 .subscribe(
                     (e) => handleSuccess(e),
                     (err) => handleError(err),
                     () => handleComplete()
                 );

    function getMergedObservable(event) {
        var value = event.target.value;
        return mergeObservables(
                    doGetMovies(value), doGetBooks(value));
    }

	function doGetMovies(e) {
        var url = "http://localhost:7878/movie?author="+e;
        return Rx.Observable.fromPromise($.getJSON(url));
	}

	function doGetBooks(e) {
        var url = "http://localhost:7878/book?author="+e;
        return Rx.Observable.fromPromise($.getJSON(url));
    }

	function mergeObservables(ob1, ob2) {
		return ob1.merge(ob2)
                  .reduce(
                      (acc, elem) => acc.concat(elem), []
                  );
	}

	function handleSuccess(data_set) {
		var table = document.getElementById("data-table");
		var table_body = table.getElementsByTagName("tbody")[0];
		deleteTableRows(table_body);
        data_set.forEach(function (element, index) {
            var row = table_body.insertRow(index);
            var cell1 = row.insertCell(0);
            var cell2 = row.insertCell(1);
            var cell3 = row.insertCell(2);
            cell1.innerHTML = element.name;
            cell2.innerHTML = element.author;
            cell3.innerHTML = element.type;
        });
	}

	function deleteTableRows(tableBody) {
        while (tableBody.hasChildNodes()) {
            tableBody.removeChild(tableBody.lastChild);
        }
    }

    function handleError(error) {
        console.error(error);
    }

    function handleComplete() {
        console.log("Completely handled the Event!");
    }
});

