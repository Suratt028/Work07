public class Test4 {
    public static void main(String[] args) {
        // สร้าง Array ขนาด 100
        int[] myArray = new int[100];
        int size = 8;

        // กำหนดค่าเริ่มต้นให้กับ 8 ตัวแรก
        for (int i = 0; i < size; i++) {
            myArray[i] = i + 1; // เพิ่ม 1 เพื่อให้ค่าเริ่มต้นจาก 1
        }

        // พิมพ์ค่าเริ่มต้นของอาร์เรย์
        System.out.println("อาร์เรย์ก่อนการแก้ไข:");
        for (int i = 0; i < size; i++) {
            System.out.print("a"+myArray[i] + " ");
        }
        System.out.println();

        // แทรกค่าใหม่ที่ตำแหน่งที่ 2 (สมมติให้ค่าใหม่คือ 10)
        int it = 10;
        int indexToInsert = 2;

        // เลื่อนข้อมูลที่อยู่หลัง indexToInsert ไปหนึ่งตำแหน่ง เรื่อยๆ จนถึงตำแหน่งสุดท้าย
        for (int i = size++ ; i > indexToInsert; i--) {
            myArray[i] = myArray[i - 1];
        }

        // แทรกค่า it ที่ตำแหน่ง indexToInsert
        myArray[indexToInsert] = it;
        // พิมพ์ค่าของอาร์เรย์หลังจากแทรก
        System.out.println("อาร์เรย์หลังการแก้ไข:");
        for (int i = 0; i < size; i++) {
            System.out.print("a"+myArray[i] + " ");
        }
        System.out.println();
    }
}
