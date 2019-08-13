# appium-course
Curso de Appium-Java da Udemy

# Instalação Appium

1. Instalar JDK
  * Para verificar a instalação da JDK, digitar o comando:  
     ``` java -version ```
   
 2. Instalar Android Studio
 * Após instalação, as configurações devem ser:
       *File > Settings > Appearence & Behavior > Android SDK*
    * Aba SDK Plataform: Selecionar o android **menor que 27**
    * Aba SDK tools, selecionar:
       - [x] Android SDK Build-tools 
       - [x] Android SDK Plataform-tools 
       - [x] Android SDK tools 

3.  Configurar a variável de ambiente ANDROID_HOME
  * No linux, deve digitar o comando:
  
      ``` vi ~/.bashrc ```
  
  * Abrirá as configurações, deve ser adicionado o caminho do ANDROID_HOME e incluir ele no PATH

    ``` export ANDROID_HOME=caminho_do_SDK ```
    
    ``` export PATH=$ANDROID_HOME/tools:$ANDROID_HOME/tools/bin:$ANDROID_HOME/platform-tools:$JAVA_HOME... ``` 
  
  > Caminho do ANDROID_HOME pode ser encontrado no Android studio por File > Settings > Appearence & Behavior > Android SDK > Android SDK Location)  

  * Para executar as alterações do arquivo, digitar o comando:
      
      ``` source ~/.bashrc ```

  * Para verificar o reconhecimento, feche e abra o terminal, e digite os comandos:
  
    ``` adb```
    
    ``` emulator ```
    
    ``` uiautomatorviewer ```
  
4. Criar um novo projeto no Android Studio, e criar um novo device.

  * Para usar o emulador sem pelo terminar, digitar:
   
   ```emulator -list-avds ``` 

  * Comando para entrar na pasta do emulador:
    
    ``` cd $ANDROID_HOME ```

  * Na pasta tools, execute o comando para iniciar o emulador:
    
    ``` emulator @nome_do_emulador ```


