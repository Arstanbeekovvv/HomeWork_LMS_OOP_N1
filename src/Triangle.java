public class Triangle {
    float a, b, c;
    public Triangle(float a, float b, float c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public float area(){
        float p = (a + b + c ) / 2;
        float S = (float) Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return S;
    }
}
