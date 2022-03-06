public class Doc {

    public static void main(String[] args) {  //класса Printer

        Printer PrinterOne = new Printer(); //объекты класса Printer
        PrinterOne.append("text1", "name1", 1);
        PrinterOne.append("text2", "name2", 2);
        PrinterOne.append("text3", "text3", 3 );
        PrinterOne.print("Принтер 1");
        PrinterOne.print("Все добавленные документы распечатаны");
        PrinterOne.totalPage = PrinterOne.getPagesCount();
        PrinterOne.documentsCount = PrinterOne.getDocumentsCount();
        System.out.println("Общее количество страниц добавленых на печать: " + PrinterOne.totalPage + " стр.;");
        System.out.println("Общее количество добавленых на печать документов: " + PrinterOne.documentsCount + ";");
        PrinterOne.getHistory();

        Printer PrinterTwo = new Printer();  //объекты класса Printer
        PrinterTwo.append("text4", "text4", 4 );
        PrinterTwo.print("Принтер 2");
        PrinterTwo.print("Все добавленные документы распечатаны");
        PrinterTwo.totalPage = PrinterTwo.getPagesCount();
        PrinterTwo.documentsCount = PrinterTwo.getDocumentsCount();
        System.out.println("Общее количество страниц добавленых на печать: " + PrinterTwo.totalPage + " стр.;");
        System.out.println("Общее количество добавленых на печать документов: " + PrinterTwo.documentsCount + ";");
        PrinterTwo.getHistory();
    }

    static class Printer {           //класс Printer
        private String queue = "" ;
        private int totalPage = 0;
        private int documentsCount = 0;
        private int totalPageHistory = 0;
        private int documentsCountHistory = 0;

        public void append(String text){
            append(text, "", 0);
        }

        public void append(String text, String name) {
            append(text, name, 0);
        }

        public void append(String text, String name, int page) {
            totalPage = totalPage + page;
            documentsCount = documentsCount + 1;
            queue = queue + "Содержание:" + text + " Название:" + name + " Страницы:" + page + "\n";
        }

        public void clear() {
            queue = "";
            totalPage = 0;
            documentsCount = 0;
        }

        public void print(String title) {
            System.out.println(title);
            if (queue.isEmpty()) {
                System.out.println("Документы на печать отсутсвуют");
            } else {
                System.out.println(queue);
                totalPageHistory = totalPageHistory + totalPage;
                documentsCountHistory = documentsCountHistory + documentsCount;
                clear();
            }
        }

        public int getPagesCount(){
            return totalPage;
        }

        public int getDocumentsCount() {
            return documentsCount;
        }

        public void getHistory() {
            System.out.println("Всего распечатанно страниц: " + totalPageHistory + "; Всего распечатанно документов: " + documentsCountHistory);

        }

    }
}

