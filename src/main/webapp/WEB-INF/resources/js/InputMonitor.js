$(document).ready(function () {
    document.getElementById("name").addEventListener("keyup", function(event){
        var value = event.target.value;
        var table_body = document.getElementById("data-table").getElementsByTagName("tbody")[0];
        deleteTableRows(table_body);
        doGetMovies(value);
        doGetBooks(value);
    });

    function doGetMovies(e) {
        var url = "http://localhost:7878/movie?author="+e;
        $.get(url, getData);
    }

    function doGetBooks(e) {
        var url = "http://localhost:7878/book?author="+e;
        $.get(url, getData);
    }

    function getData(data) {
        insertDataIntoTable(data);
    }

    function insertDataIntoTable(data_set) {
        var table = document.getElementById("data-table");
        var table_body = table.getElementsByTagName("tbody")[0];
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
});

