
class Solution {
    List<String> result = new ArrayList<>();

    public List<String> AllPossibleStrings(String s) {
        solve(s, 0, new StringBuilder());
        Collections.sort(result);   // ensure lexicographic order
        return result;
    }

    private void solve(String s, int index, StringBuilder sb) {
        if (index == s.length()) {
            if (sb.length() > 0) {  // ignore empty subsequence
                result.add(sb.toString());
            }
            return;
        }

        // Include current character
        sb.append(s.charAt(index));
        solve(s, index + 1, sb);

        // Backtrack
        sb.deleteCharAt(sb.length() - 1);

        // Exclude current character
        solve(s, index + 1, sb);
    }
}