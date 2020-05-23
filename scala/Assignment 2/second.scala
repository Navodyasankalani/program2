object second{

def attendees(price:Int):Int={
return 120 + (15 - price)*20/5;
}

def revenue(price:Int):Int={
return attendees(price)*price;
}

def cost(price:Int):Int={
return 500 + attendees(price)*3;
}

def profit(price:Int):Int={
return revenue(price)-cost(price);
}

def main(args: Array[String]){

println(profit(5),profit(20));
}

}