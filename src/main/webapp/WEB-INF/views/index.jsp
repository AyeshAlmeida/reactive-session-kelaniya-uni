<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>RxJs Sample</title>
        <link rel="stylesheet" href="<c:url value="/resources/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>"/>
    </head>
    <body>
    <div class="container">
        <h2 class="lead" align="center">
            <b>Search For Applications or Books....</b>
        </h2>
        <div>
            <form class="form-horizontal">
                <fieldset>
                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="author-name">Search Criterea</label>
                        <div class="col-md-5">
                            <input id="author-name" name="lab_1" type="text" placeholder="author " class="form-control input-md" required="">
                            <span class="help-block">enter the author name</span>
                        </div>
                    </div>
                </fieldset>
            </form>
        </div>

        <div>
            <table class="table" id="data-table">
                <thead>
                <tr>
                    <th>Name</th>
                    <th>Author</th>
                    <th>Category</th>
                </tr>
                </thead>
                <tbody>
                </tbody>
            </table>
        </div>
    </div>

    <script src="<c:url value="/resources/jQuery/jquery-3.2.1.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/RxJs/Rx.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/bootstrap-3.3.7-dist/js/bootstrap.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/InputMonitor.js"/>"></script>
    </body>
</html>