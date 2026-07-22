class Solution {
    public boolean isValidSudoku(char[][] board) {

        Set<Character> set;

        for(int i=0;i<9;i++) {
            set = new HashSet<>();
            for(int j=0;j<9;j++) {
                char c = board[i][j];
                if (c=='.') continue;
                if(set.contains(c)) {
                    return false;
                }
                set.add(c);
            }
        }

        for(int i=0;i<9;i++) {
            set = new HashSet<>();
            for(int j=0;j<9;j++) {
                char c = board[j][i];
                if (c=='.') continue;
                if(set.contains(c)) {
                    return false;
                }
                set.add(c);
            }
        }

        Map<String,Set<Character>> map = new HashMap<>();
        for(int i=0;i<3;i++) {
            for(int j=0;j<3;j++) {
                String key = ""+i+j;
                map.put(key, new HashSet<>());
            }
        }

        for(int i=0;i<9;i++) {
            for(int j=0;j<9;j++) {
                char c = board[i][j];
                if (c=='.') continue;
                String key = "" + i/3 + j/3;
                if(map.get(key).contains(c)) {
                    return false;
                }
                map.get(key).add(c);
            }
        }

        return true;
        
    }
}
