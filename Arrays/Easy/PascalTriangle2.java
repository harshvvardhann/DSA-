package Arrays.Easy;
import java.util.ArrayList;
import java.util.List;
class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);

        for(int i=0;i<rowIndex;i++){
            List<Integer> newrow = new ArrayList<>();
            newrow.add(1);
            for(int j=1;j<row.size();j++){
                newrow.add(row.get(j-1) + row.get(j));
            }
            newrow.add(1);
            row = newrow;
        }

        return row;
    }
}