<form method="POST" action="/offers" modelAttribute="searchAttributes">
  <div class="form-group col-lg-12">
    <label for="destinationCity">Destination City</label>
    <input type="text" class="form-control" id="destinationCity" placeholder="City">
  </div>
  <div class="form-group col-lg-12">
      <div class="col-lg-6">
         <label for="minTripStartDate">Min Trip Start Date</label>
         <input type="date" class="form-control" id="minTripStartDate" placeholder="Trip Start Date">
      </div>
      <div class="col-lg-6">
         <label for="maxTripStartDate">Max Trip Start Date</label>
         <input type="date" class="form-control" id="maxTripStartDate" placeholder="Max Trip Start Date">
      </div>
  </div>
  <div class="form-group col-lg-12">
      <label for="lengthOfStay">Length Of Stay</label>
      <input type="number" class="form-control" id="lengthOfStay" placeholder="Length Of Stay">
  </div>
  <div class="form-group col-lg-12">
     <div class="col-lg-6">
      <label for="minStarRating">Min Star Rating</label>
      <input type="number" class="form-control" id="minStarRating" placeholder="Min Star Rating">
      </div>
      <div class="col-lg-6">
      <label for="maxStarRating">Max Star Rating</label>
      <input type="number" class="form-control" id="maxStarRating" placeholder="Max Star Rating">
    </div>
  </div>
 <div class="form-group col-lg-12">
  <button type="submit" class="btn btn-lg btn-success">Find Offers</button>
 </div>
</form>