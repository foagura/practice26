class Employee {
    int id = 100;
    int getId() {
        return id;
    }
}

class Sales extends Employee {    // Employeeクラスを継承したSalesクラス（サブクラス）を定義
    String clientName = "SE";
    String getClientName() {
        return clientName;
    }
}

public class Practice26 {
    public static void main(String[] args) {
        Sales sale = new Sales();    // Salesクラスをインスタンス化
        System.out.println(sale.getId());    // SalesクラスはEmployeeクラスのメンバを引き継いでいる
        System.out.println(sale.getClientName());
    }
}
