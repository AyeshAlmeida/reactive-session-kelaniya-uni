<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>RxJs Sample</title>
        <link rel="stylesheet" href="<c:url value="/resources/bootstrap-3.3.7-dist/css/bootstrap.min.css"/>"/>
    </head>
    <body style="background-image: url('/resources/images/back.jpg');background-repeat: no-repeat;
                 background-attachment: fixed;background-position: center;color: white;">
    <div class="container">
        <h2 class="lead" align="center">
            <b>Free Book / Movie Details</b>
        </h2>
        <div>
            <form class="form-horizontal">
                <fieldset>
                    <!-- Text input-->
                    <div class="form-group">
                        <label class="col-md-4 control-label" for="author-name">Search Criteria</label>
                        <div class="col-md-5">
                            <input id="name" name="lab_1" type="text" placeholder="name " class="form-control input-md" required="">
                            <span class="help-block">enter the book / movie name</span>
                        </div>
                    </div>
                </fieldset>
            </form>
        </div>

        <div>
            <table class="table" id="data-table">
                <thead style="font-size: 25px">
                    <tr>
                        <th>Name</th>
                        <th>Author</th>
                        <th>Category</th>
                    </tr>
                </thead>
                <tbody style="font-size: 15px;">
                </tbody>
            </table>
        </div>
    </div>

    <script src="<c:url value="/resources/jQuery/jquery-3.2.1.min.js"/>"></script>
    <%--<script type="text/javascript" src="<c:url value="/resources/RxJs/Rx.min.js"/>"></script>--%>
    <script type="text/javascript" src="<c:url value="/resources/bootstrap-3.3.7-dist/js/bootstrap.min.js"/>"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/InputMonitor.js"/>"></script>
    </body>
</html>