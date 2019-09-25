# appium-course
Curso de Appium-Java da Udemy

# Instalação Appium Ubuntu

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
 
 > Caso dê **erro**: ```/dev/kvm permission denied.``` ao gerar um emulador, execute:
 > ```sudo apt install qemu-kvm```
 > ```ls -al /dev/kvm``` 
 > ```grep kvm /etc/group```, deve retornar: ```kvm:x:numero:```
 > por fim, ```sudo adduser $USER kvm``` e reinicie a maquina.

  * Comando para entrar na pasta do emulador:
    
    ``` cd $ANDROID_HOME ```
    
  * Para usar o emulador pelo terminar, digitar:
   
   ``` emulator -list-avds ``` 

  * Na pasta tools, execute o comando para iniciar o emulador:
    
    ``` emulator @nome_do_emulador ```

5. Instalar o appium
 * Baixar https://github.com/appium/appium-desktop ou 
 
 * Pelo terminal, baixe o Node (https://nodejs.org/download/release/latest/):
   
   ``` cd /usr/local```
   ``` tar --strip-components 1 -xzf /home/superman/Downloads/node-v8.2.1-linux-x64.tar.gz``` 
   
   Para verificar se o node foi instalado com sucesso, digitar o comando:
   
   ``` which node```, deve retornoar o path do node e o comando ``` node -v``` exibe a versão instalada.
   
   Ser instalado o npm como admin ```sudo su```:
  
  ``` npm install npm@latest -g```, depois executar o comando:
  
  ``` npm install -g npm``` para atualizar a versão.
  
  ``` sudo npm install -g web-component-tester --unsafe-perm``` para instalar alguns componetes de test
  
   Instalar dependencias do appium, como admin:
 
   ```sudo apt-get install build-essential \```
   
   ```curl git m4 ruby texinfo libbz2-dev \```
    
    ```libcurl4-openssl-dev libexpat-dev libncurses-dev zlib1g-dev```

   Instalar o linuxbrew:
   
   ```sh -c "$(curl -fsSL https://raw.githubusercontent.com/Linuxbrew/install/master/install.sh)"```

   Configurar as variáveis de ambiente:
   
   ```export LINUX_BREW="/home/linuxbrew/.linuxbrew/bin"```
   
   ```export MANPATH="/home/linuxbrew/.linuxbrew/share/man"```
   
   ```export INFOPATH="/home/linuxbrew/.linuxbrew/share/info"```
   
   ```export PATH=$LINUX_BREW:$MANPATH:$INFPATH:...``` 
   
   Executar:
   
   ```source ~/.bashrc```
   
   Instalar linuxbrew-wrapper:
   
   ```sudo apt linuxbrew-wrapper```
   
   Instalar o gcc:
   
   ```brew install gcc```
   
   Executar:
   
   ```brew node install```
   
   ```brew unlink node && brew link node```
   
   Como admin, instalar o appium:

``` npm install -g appium ```, para verificar a instalação, ``` appium```

> Se houver problema de permissionamento ``` sudo npm install -g appium --unsafe-perm=true --allow-root```
 
