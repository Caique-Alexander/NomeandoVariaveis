fun main(args: Array<String>) {
    var nome = ""
    var idade = 0
    var prefDeEmprego = ""
    var nacionalidade = ""
    var tipoSanguineo = ""
    var anoDeNascimento = 0
    var anoAtual = 0

    anoDeNascimento = anoAtual - idade

    print("Digite seu nome: ")
    nome = readLine()!!
    print("Digite sua idade: ")
    idade = readLine()!!.toInt()
    print("Digite seu ano de nascimento: ")
    anoDeNascimento = readLine()!!.toInt()
    print("Digite sua preferência de emprego: ")
    prefDeEmprego = readLine()!!
    print("Digite sua nacionalidade: ")
    nacionalidade = readLine()!!
    print("Digite seu tipo sanguíneo: ")
    tipoSanguineo = readLine()!!
    print("Nasci no ano de $anoDeNascimento")
}