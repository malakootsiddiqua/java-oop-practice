public Rationalnumber{
    private int numerator;
    private int denominator:

    public Rationalnumber (int num , int den){
        if (den==0){
            throw new IllegalArgumentException("Denominator cannot be zero");
        }
        this.numerator =num;
        this.denominator = den;
    }
    public void get(){
        System.out.println("Rational Number: " + numerator + "/" + denominator);
    }
    public rationalnumber add(rationalnumber other){

        int num = this.numerator * other.denominator + other.numerator * this.denominator;
        int den = this.denominator * other.denominator;
        return new rationalnumber(num, den);
    }
    public rationalnumber subtract(Rationalnumber other){
        int num = this.numerator * other.denominator - other.numerator * this.denominator;
        int den = this.denominator * other.denominator;
        return new Rationalnumber(num, den);
    }

    
