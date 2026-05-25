class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        # print(s)
        # print(t)

        if (len(s) != len(t)): return False

        s_dict = defaultdict(int)
        t_dict = defaultdict(int)
        for i in range(len(s)):
            s_key = s[i]
            t_key = t[i]
            s_dict[s_key] = 1 + s_dict[s_key]
            t_dict[t_key] = 1 + t_dict[t_key]

        # print(s_dict.values())
        # print(t_dict.values())

        return s_dict == t_dict
