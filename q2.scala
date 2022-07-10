object q2 extends App {
    var a:Int=2;
    var b:Int=3;
    var c:Int=4;
    var d:Int=5;
    var k:Float=4.3f;
    var g=4.0f;
    
    b=b-1;//--b
    println(b * a + c *d);//println( - -b * a + c *d - -)
    a = a+1;//a++
    println( a );//println(a++)
    println (-2 * ( g - k ) +c);
    c = c+1;//c++
    println (c);//println (c=c++)
    c=(c+1)*a;
    println(c);//println (c=++c*a++)

}