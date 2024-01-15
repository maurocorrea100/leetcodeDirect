class Solution(object):
    def findWinners(self, matches):
        winners = []
        loosers1 = []
        res = []

        score_map = defaultdict(lambda: [0, 0])

        for pair in matches:
            winner, looser = pair[0], pair[1]
            score_map[winner][0] += 1
            score_map[looser][1] += 1

        for key, value in score_map.items():
            loosing_score = value[1]
            if loosing_score == 0:
                winners.append(key)
            if loosing_score == 1:
                loosers1.append(key)

        winners.sort()
        loosers1.sort()
        res.append(winners)
        res.append(loosers1)
        return res
        