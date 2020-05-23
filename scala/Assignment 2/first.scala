object first{

def wage(h1:Int):Int={
return h1*150;
}

def ot(h2:Int):Int={
return h2*75;
}

def income(h1:Int,h2:Int):Int={
return wage(h1) + ot(h2);
}

def tax(income:Int):Double={
return income*0.1;
}

def takehome(h1:Int,h2:Int):Double={
return income(h1,h2)-tax(income(h1,h2));
}

def main(args: Array[String]){


println(takehome(40,20));

}

}