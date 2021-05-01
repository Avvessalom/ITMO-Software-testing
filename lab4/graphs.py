import matplotlib.pyplot as plt
import matplotlib

files = ["results/2_160_results.csv", "results/2_320_results.csv", "results/2_480_results.csv",
         "results/2_600_results.csv"]
values = []
x = [160, 320, 480, 600]
_max = []
_mean = []

def mmax(_values) -> int:
    max = -1
    for i in _values:
        if int(i) > max:
            max = int(i)
    return max


def mean(_values) -> int:
    sum = 0
    for i in _values:
        sum += int(i)
    return int(sum / len(_values))


for filename in files:
    with open(filename, 'r') as file:
        lines = file.readlines()
        for line in lines:
            try:
                latency = line.split(',')
                values.append(latency[len(latency) - 3])
            except ValueError:
                continue
    values.pop(0)
    avg = mean(values)
    _max.append(mmax(values))
    _mean.append(avg)
    values.clear()
print(_max)
blue_patch = matplotlib.patches.Patch(color='blue', label='Max response time')
orange_patch = matplotlib.patches.Patch(color='orange', label='Threshold')
green_patch = matplotlib.patches.Patch(color='green', label='Avg response time')
plt.legend(handles=[blue_patch, green_patch, orange_patch])

plt.plot(x, _max, marker='o')
plt.ylabel("Max response time in ms")
plt.xlabel("Samples per minute")
plt.title("Second config")

plt.plot(x, [840 for i in range(len(x))])
plt.plot(x, _mean)

plt.savefig("second.svg")
