<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<table class="table">
    <tbody>
    <c:forEach items="${deals.offers.hotel}" var="hotel">
        <tr>
          <div class="card">
            <div class="card-block" style=" border: 1px solid #807b7c; border-radius: 5px; padding: 10px; padding-top:0px; margin:5px; ">
              <h3 class="card-title">${hotel.hotelInfo.hotelName}</h3>
              <h4 class="card-title">${hotel.hotelInfo.hotelCity}</h2>
              <h4 class="card-title">${hotel.offerDateRange.travelStartDate} - ${hotel.offerDateRange.travelEndDate}</h2>
              <p class="card-text">${hotel.hotelPricingInfo.averagePriceValue}${hotel.hotelPricingInfo.currency}</p>
              <a href="#" class="btn btn-primary">Go somewhere</a>
            </div>
          </div>
        </tr>
    </c:forEach>
    </tbody>
 </table>