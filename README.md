# appium-course
Curso de Appium-Java da Udemy

Instalação Appium
<ol>
  <li> Instalar JDK
    Para verificar a instalação da JDK, digitar o comando:
    
        java -version
  
  </li>
  <li> Instalar Android Studio
    <ul>  
        <li> Nesse ponto, as configurações devem ser:
            File > Settings > Appearence & Behavior > Android SDK </li>
        <li> Aba SDK Plataform: Selecionar o android **menor que 27** </li>
        <li> Aba SDK tools, selecionar:
              </li> - [x] Android SDK Build-tools </li>
              </li> - [x] Android SDK Plataform-tools </li>
              </li> - [x] Android SDK tools </li>
         </li>   
         <li>Ok </li>
     </ul>    
   </li>         
   <li> Configurar Variável de ambiente ANDROID_HOME

No linux, deve digitar o comando:
    vi ~/.bashrc
Abrirá as configurações, deve ser adicionado o caminho do ANDROID_HOME e incluir ele no PATH

    export ANDROID_HOME=caminho_do_SDK (Pode ser encontrado em File > Settings > Appearence & Behavior > Android SDK > Android SDK Location)
    export PATH=$ANDROID_HOME/tools:$ANDROID_HOME/tools/bin:$ANDROID_HOME/platform-tools:$JAVA_HOME...

Para executar as alterações do arquivo, digitar o comando:
    source ~/.bashrc

Para verificar o reconhecimento, feche e abra o terminal, e digite os comandos:
    adb
    emulator
    uiautomatorviewer
  </li>
4) Criar um novo projeto no Android Studio
    Criar um novo device

Para usar o emulador sem pelo terminar, digitar:
    emulator -list-avds 

Comando para entrar na pasta do emulador:
    cd $ANDROID_HOME

e entre na pasta tools:
    cd tools

execute o comando para iniciar o emulador:
    emulator @nome_do_emulador

</ol>
