package chapter3;

// static是一個關鍵字，主要是用來做內存管理
// 其可以將class裡變數、method變成靜態的，靜態的意思是，在程式載入記憶體的時候，跟著程式一起在記憶體中佔有空間，而不是主程式開始執行後才跟記憶體要空間
// 簡單來說就是讓不容易做變更的變數、method變成專屬於class的類似固定的資料，不會隨著constructor被呼叫時一起被重複的建立，以節省記憶體，因此在使用static變數、method時就不用先建立物件，而是可以直接呼叫使用(在psvm裡)

public class StaticJava {

    private double radius;
    private static final double PI = 3.14;

    public StaticJava() {
        this(1.0);
    }

    public StaticJava(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return StaticJava.PI * Math.pow(this.radius, 2);
    }

    // 在psvm裡要執行的method也一定要是static
    public static void main(String[] args) {
        StaticJava s = new StaticJava(10);
        System.out.println(s.getArea());

        // 新建立的class還是可以拿的到static的值
        System.out.println(s.PI);
    }
}
