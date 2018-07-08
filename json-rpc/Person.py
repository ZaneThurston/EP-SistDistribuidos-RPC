from enum import Enum

class PhoneType(Enum):
    MOBILE = 0
    HOME = 1
    WORK = 2

class Status(Enum):
    CADASTRADO = 0
    NAOCADASTRADO = 1

class PhoneNumber:
    number = ''
    typePhone = ''

class MyPerson:
    name = ''
    email = ''
    phones = [PhoneNumber]

class PersonReply:
    id = 0
    name = ''
    stat = 0

