object q4_a extends App{
   def normal(normal_hrs1: Int):Int = normal_hrs1*250;
   def OT(ot_hrs1: Int):Int = ot_hrs1*85;
   def total(normal_hrs2: Int, ot_hrs2: Int) = normal(normal_hrs2)+OT(ot_hrs2);
   def tax(total: Int):Double = total*12/100;
   def take_home(normal_hrs3: Int, ot_hrs3: Int):Double = total(normal_hrs3,ot_hrs3)-tax(total(normal_hrs3,ot_hrs3)); 
   printf("Take Home Salary = Rs %.2f",take_home(40,30));

}