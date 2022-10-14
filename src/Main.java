public class Main {
    public static void main(String[] args) {
        //კოეფიციენტები a,b და c.
        double a=6 , b=10, c=-1;

        //დეტერმინატის დაბრუნება
        double determinant = b * b - 4 * a * c;

        if (determinant >0){
            System.out.print("დეტერმინანტი არის : " + determinant + ", რაც იმას ნიშნავს , რომ განტოლებას ორი სხვადასხვა ამონახსნი აქვს, ე.ი. პარაბოლა x ღერძს ორ წერტილში კვეთს.");

        }
        else if (determinant==0){
            System.out.print("დეტერმინანტი არის : " + determinant + ", რაც იმას ნიშნავს , რომ ორივე ფესვი არსებითია და ერთმანეთის ტოლია");
        }

        else  {
            System.out.print("დეტერმინანტი არის : " + determinant +  ", რაც იმას ნიშნავს , რომ განტოლებას ამონახსნი არა აქვს, ე.ი. პარაბოლა აბსცისათა ღერძს არ კვეთს და Y ნიშანმუდმივია.");
        }
    }
}