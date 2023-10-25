def parrot(voltage, state='a stiff', action='voom', type='Norwegian Blue'):
    print("-- This parrot wouldn't", action, end=' ')
    print("if you put", voltage, "volts through it.")
    print("-- Lovely plumage, the", type)
    print("-- It's", state, "!")

parrot(1000)
print("------")
parrot(voltage=1000)
print("----------")
parrot(voltage=1000, action="Voooom")
print("========")
parrot(action='VOOOOOM', voltage=1000000)
print("$$$$$$")
parrot('a million', 'bereft of life', 'jump')
print("#########")
parrot('a thousand', state='pushing up the daisies')

# invalid calls
parrot(voltage=5.0, 'dead')