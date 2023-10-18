# match statements (similar to pattern matching)

def http_error(status):
    match status:
        case 400:
            return "bad request"
        case 404:
            return "page not found"
        case 418:
            return "I'm a teapot"
        case 401 | 403 | 404:
            return "not allowed"
        case _:
            return "something's wrong with the internet"
        

# print(http_error(404))

# point is an (x,y) tuple
point =(4,5)

def point_match(point):
    match point:
        case (0,0):
            print("Origin")
        case (0,y):
            print(f"Y={y}")
        case (x,0):
            print(f"X={x}")
        case (x,y):
            print(f"x={x}, y={y}")
        case _:
            raise ValueError("not a point")
        
point_match((0,3))