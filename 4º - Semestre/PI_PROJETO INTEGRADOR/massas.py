import requests
from fordev.generators import people

URL = 'http://192.168.15.16:8080/'

login = {
    "email": "matheusbatuque@gmail.com",
    "password": "senha123"
}

h = {
    'Content-Type': 'application/json'
}


req = requests.post(f'{URL}api/v1/login',json=login, headers=h)
tk = req.headers['Authorization']


dados = people(n=30)

for d in dados:

    p = {   "email": d['email'],
            "nome" : d['nome'].split()[0],
            "sobrenome" : d['nome'].replace(d['nome'].split()[0], "").strip(),
            "cpf" : d['cpf'],
            "dataNascimento" : f'{d["data_nasc"].split("/")[2]}-{d["data_nasc"].split("/")[1]}-{d["data_nasc"].split("/")[0]}',
            "genero" : d['sexo'].upper()
    }
    requests.post(f'{URL}api/v1/cliente/register',json=p, headers={
        "Authorization": f'Bearer {tk}',
        'Content-Type': 'application/json'
    })

