
ripeti = 'yes'
while ripeti == 'yes':
    num1 = float(input("enter first number:  "))
    op = input("enter operetor: ")
    if op == "+":
        num2 = float(input("enter second number: "))
        print(num1 + num2)
        ripeti = input('do you want to repete the function? ')
    elif op == "-":
        num2 = float(input("enter second number: "))
        print(num1 - num2)
        ripeti = input('do you want to repete the function? ')
    elif op == "/":
        num2 = float(input("enter second number: "))
        print(num1 / num2)
        ripeti = input('do you want to repete the function? ')
    elif op == "*":
        num2 = float(input("enter second number: "))
        print(num1 * num2)
        ripeti = input('do you want to repete the function? ')
    elif op == "**":
        num3 = float(input("enter elevate number: "))
        op_2 = input("enter operetor: ")
        ripeti = input('do you want to repete the function? ')
        if op_2 == "+":
            num2 = float(input("enter second number: "))
            print(num1**num3 + num2)
            ripeti = input('do you want to repete the function? ')
        elif op_2 == "-":
            num2 = float(input("enter second number: "))
            print(num1**num3 - num2)
            ripeti = input('do you want to repete the function? ')
        elif op_2 == "/":
            num2 = float(input("enter second number: "))
            print(num1**num3 / num2)
            ripeti = input('do you want to repete the function? ')
        elif op_2 == "*":
            num2 = float(input("enter second number: "))
            print(num1**num3 * num2)
            ripeti = input('do you want to repete the function? ')
        else:
            print(num1**num3)
            ripeti = input('do you want to repete the function? ')
    else:
        print("pls user use this +,-,/,*,**")
        ripeti = input('do you want to repete the function? ')
''
