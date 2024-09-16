function executarExercicio22() {
    alert(`Exercicio 22)\n A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês, o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas). `)

    let horasTrabalhadas = parseFloat(prompt(`Digite a quantidade de horas trabalhadas: `))
    let salarioHora = parseFloat(prompt(`Digite a quantidade de salário por hora: `))
    let salarioTotal

    if (horasTrabalhadas <= 160) {
        salarioTotal = salarioHora * horasTrabalhadas
    } else {
        salarioTotal = (160 * salarioHora) + ((horasTrabalhadas - 160) * salarioHora * 1.5)
    }
    alert(`O salário total será: ${salarioTotal}`)
}