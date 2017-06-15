<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<form:form method="POST" action="/offers" modelAttribute="searchAttributes">
    <div class="form-group col-lg-12">
        <label for="destinationCity">Destination City</label>
        <form:input type="text" class="form-control" id="destinationCity" placeholder="City"
                    path="destinationCity"/>
    </div>
    <div class="form-group col-lg-12">
        <label for="lengthOfStay">Length Of Stay</label>
        <form:input path="lengthOfStay" type="number" class="form-control" id="lengthOfStay"
                    placeholder="Length Of Stay"/>
    </div>
    <div class="form-group col-lg-12">
        <div class="col-lg-6">
            <label for="minTripStartDate">Min Trip Start Date</label>
            <form:input path="minTripStartDate" type="date" class="form-control" id="minTripStartDate"
                        placeholder="Trip Start Date"/>
        </div>
        <div class="col-lg-6">
            <label for="maxTripStartDate">Max Trip Start Date</label>
            <form:input path="maxTripStartDate" type="date" class="form-control" id="maxTripStartDate"
                        placeholder="Max Trip Start Date"/>
        </div>
    </div>
    <div class="form-group col-lg-12">
        <div class="col-lg-6">
            <label for="minStarRating">Min Star Rating</label>
            <form:input path="minStarRating" type="number" class="form-control" id="minStarRating"
                        placeholder="Min Star Rating"/>
        </div>
        <div class="col-lg-6">
            <label for="maxStarRating">Max Star Rating</label>
            <form:input path="maxStarRating" type="number" class="form-control" id="maxStarRating"
                        placeholder="Max Star Rating"/>
        </div>
    </div>
    <div class="form-group col-lg-12">
        <input type="submit" class="btn btn-lg btn-success" value="Find Offers"/>
    </div>
</form:form>
