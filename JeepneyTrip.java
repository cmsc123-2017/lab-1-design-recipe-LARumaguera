
class JeepneyTrip {
  double distance;
  int totalPassengers;
  int discountPassengers;

  // constants
  final int BASE_KM = 5;
  final double EXCESS_FARE = 0.50;
  final int NO_DISCOUNT_FARE = 7;
  final int DISCOUNTED_FARE = 6;


  JeepneyTrip(double distance, int totalPassengers, int discountPassengers) {
    this.distance = distance;
    this.totalPassengers = totalPassengers;
    this.discountPassengers = discountPassengers;
  }

  // -> double
  //Returns the change given this fare paid
  double fareChange(double payment) {
    return totalFare() - payment;
  }
  
  double totalFare(){
      return noDiscountFare() + discountedFare();
  }

  boolean beyond5Km(){
    return (distance > 5);
  }

  double discountedFare(){
    if(beyond5Km()){
      return ((((distance - BASE_KM) * EXCESS_FARE) + DISCOUNTED_FARE) * discountPassengers);
    } else {
      return DISCOUNTED_FARE * discountPassengers;
    }
  }

  double noDiscountFare(){
    if(beyond5Km()){
      return ((((distance - BASE_KM) * 0.50) + NO_DISCOUNT_FARE) * (totalPassengers - discountPassengers));
    } else {
      return (NO_DISCOUNT_FARE * (totalPassengers - discountPassengers));
    }
  }

}

