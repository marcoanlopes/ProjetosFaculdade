#include<stdio.h>
#include<stdlib.h>
#include<locale.h>
//&& é o E do C ---- 
//entao e fimse = {}
//|| é o OU do C
// (DOUBLE TRANSFORMA NUMERO INTEIRO) --- 
// %.xf é a quantidade de casas decimais 
int main(){
    // setlocale(LC_ALL, "pt_BR");

    char entrevista, sexo, sintomas, doencas;
    int idade, sexo_masculino = 0, sexo_feminino = 0, totalPessoas;
    float porcentagem_sexo_masculino, porcentagem_sexo_feminino;
    system("cls");
    totalPessoas = 0;
    do
    {
        
        system("cls");
        printf("1. Informe o sexo.\n");
        fflush(stdin);
        scanf("%c", &sexo);
        if (sexo =='F'){
            sexo_feminino = sexo_feminino +1;
        }
        else if (sexo =='M'){
            sexo_masculino = sexo_masculino +1;
        }

        printf("\n2. Informe a idade.\n");
        scanf("%d", &idade);

        printf("\n3. Dificuldade em Respirar/Dor de Garganta/Febre/Tosse?\n");
        fflush(stdin);
        scanf ("%c", &sintomas);

        printf("\n4. Doencas como Diabetes/Doenca Cardiaca/Pressao Alta?\n");
        fflush(stdin);
        scanf ("%c", &doencas);

        if (sintomas =='S' && doencas =='S'){
                printf("\nProcurar unidade de saude!\n");
        }
        else if ((sintomas == 'S' || doencas == 'S') && idade > 60){
                printf("\nProcurar unidade de saude!\n");
        }
        else if ((sintomas == 'S' || doencas =='S') && (idade < 59 && idade > 40)){
                printf("\nMonitorar o estado de saude em casa.\n");
        }
        else if (sintomas =='N' || doencas == 'N'){
                printf("\n Voce esta bem, mas fique em casa!\n");
        }

        
        printf("\nDeseja continuar a entrevista? (digite S ou N)\n");
        fflush(stdin);
        scanf("%c", &entrevista);

        totalPessoas = totalPessoas + 1;

    } while (entrevista == 'S');

    printf("\n%d entrevistados \n", totalPessoas);


    porcentagem_sexo_feminino = (double)sexo_feminino/(double)totalPessoas * 100;
    porcentagem_sexo_masculino = (double)sexo_masculino/(double)totalPessoas * 100;
    printf("\n%.2f sexo feminino: ", porcentagem_sexo_feminino);
    printf("\n%.2f sexo masculino: \n", porcentagem_sexo_masculino);

    system("pause");


}

