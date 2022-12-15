import java.util.*;

public class CompanyUsers08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        Map<String, List<String>> companyEmployeeDataMap = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String[] data = input.split(" -> ");
            String companyName = data[0];
            String employeeId = data[1];

            if (!companyEmployeeDataMap.containsKey(companyName)) {
                companyEmployeeDataMap.put(companyName, new ArrayList<>());
                if (!isContainValueInList(companyEmployeeDataMap, companyName, employeeId)) {
                    companyEmployeeDataMap.get(companyName).add(employeeId);
                }
            } else {
                if (!isContainValueInList(companyEmployeeDataMap, companyName, employeeId)) {
                    companyEmployeeDataMap.get(companyName).add(employeeId);
                }
            }

            input = scanner.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : companyEmployeeDataMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.print(listIdInFormat(entry.getValue()));
        }
    }

    public static boolean isContainValueInList(Map<String, List<String>> map, String companyName, String employeeId) {

        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey().equals(companyName)) {
                for (String id : entry.getValue()) {
                    if (id.equals(employeeId)) {
                        return true;
                    }

                }
            }
        }
        return false;
    }


    public static String listIdInFormat(List<String> list) {
        StringBuilder sb = new StringBuilder();

        for (String item : list) {
            sb.append("-- ");
            sb.append(item);
            sb.append(System.lineSeparator());
        }
        return sb.toString();
    }
}

