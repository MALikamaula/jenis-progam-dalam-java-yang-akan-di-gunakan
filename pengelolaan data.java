import java.util.ArrayList;
import java.util.List;

public class DataList {
    private List<String> dataList;

    public DataList() {
        dataList = new ArrayList<>();
    }

    public void addData(String data) {
        dataList.add(data);
    }

    public void removeData(String data) {
        dataList.remove(data);
    }

    public void clearData() {
        dataList.clear();
    }

    public void printData() {
        for (String data : dataList) {
            System.out.println(data);
        }
    }
}
public class Main {
    public static void main(String[] args) {
        DataList dataList = new DataList();

        dataList.addData("Data 1");
        dataList.addData("Data 2");
        dataList.addData("Data 3");

        dataList.printData();

        dataList.removeData("Data 2");

        System.out.println("After removing Data 2:");
        dataList.printData();

        dataList.clearData();

        System.out.println("After clearing the data:");
        dataList.printData();
    }
}

