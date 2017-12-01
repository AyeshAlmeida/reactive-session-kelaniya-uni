$(document).ready(function () {
    Rx.Observable.fromEvent(document.getElementById("author-name"), 'keyup')
	             .flatMap((e) => (concatObservables(doGetApps(e.target.value), doGetBooks(e.target.value))))
		         .subscribe((e) => getDataOut(e));

	function doGetApps(e) {
		var url = "http://localhost:7878/application?author=";
		url += e;
		return Rx.Observable.fromPromise($.getJSON(url));
	}

	function doGetBooks(e) {
		var url = "http://localhost:7878/book?author=";
		url += e;
		return Rx.Observable.fromPromise($.getJSON(url));
	}

	function concatObservables(ob1, ob2) {
		return ob1.merge(ob2).reduce((acc, elem) => acc.concat(elem), []);
	}

	function getDataOut(e) {
		var table = document.getElementById('data-table');
		var tbody = table.getElementsByTagName('tbody')[0];
		deleteTableRows(tbody);
		for (var i =0; i < e.length; i++){
			var element = e[i];
			var row = tbody.insertRow(i);
			var cell1 = row.insertCell(0);
			var cell2 = row.insertCell(1);
			var cell3 = row.insertCell(2);
			cell1.innerHTML = element.name;
			cell2.innerHTML = element.author;
			cell3.innerHTML = element.type;
		}
	}

	function deleteTableRows(tableBody) {
		while (tableBody.hasChildNodes()) {
			tableBody.removeChild(tableBody.lastChild);
		}
	}
});

