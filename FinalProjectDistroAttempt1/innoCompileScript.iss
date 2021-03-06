; Script generated by the Inno Setup Script Wizard.
; SEE THE DOCUMENTATION FOR DETAILS ON CREATING INNO SETUP SCRIPT FILES!

#define MyAppName "Triploblastic Trivia Maze"
#define MyAppVersion "1.0"
#define MyAppPublisher "Team Triploblastic"
#define MyAppExeName "TriploblasticTriviaMaze.exe"

[Setup]
; NOTE: The value of AppId uniquely identifies this application.
; Do not use the same AppId value in installers for other applications.
; (To generate a new GUID, click Tools | Generate GUID inside the IDE.)
AppId={{F1D47C69-C809-460F-8A59-0FD018254E2A}
AppName={#MyAppName}
AppVersion={#MyAppVersion}
;AppVerName={#MyAppName} {#MyAppVersion}
AppPublisher={#MyAppPublisher}
DefaultDirName={pf}\{#MyAppName}
DefaultGroupName={#MyAppName}
AllowNoIcons=yes
OutputBaseFilename=setup
Compression=lzma
SolidCompression=yes

[Languages]
Name: "english"; MessagesFile: "compiler:Default.isl"

[Tasks]
Name: "desktopicon"; Description: "{cm:CreateDesktopIcon}"; GroupDescription: "{cm:AdditionalIcons}"; Flags: unchecked
Name: "quicklaunchicon"; Description: "{cm:CreateQuickLaunchIcon}"; GroupDescription: "{cm:AdditionalIcons}"; Flags: unchecked; OnlyBelowVersion: 0,6.1

[Files]
Source: "E:\FinalProjectDistro\TriploblasticTriviaMaze.exe"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\exit.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\gate1.gif"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\grass.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\Icon.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\key.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\MovieQuoteTrivia.db"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\player.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\playerEast.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\playerEast0.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\playerEast1.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\playerEast2.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\playerEast3.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\playerNorth.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\playerNorth0.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\playerNorth1.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\playerNorth2.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\playerNorth3.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\playerSouth.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\playerSouth0.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\playerSouth1.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\playerSouth2.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\playerSouth3.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\playerWest.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\playerWest0.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\playerWest1.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\playerWest2.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\playerWest3.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\start.png"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\Stone_Tile.gif"; DestDir: "{app}"; Flags: ignoreversion
Source: "E:\FinalProjectDistro\wall.png"; DestDir: "{app}"; Flags: ignoreversion
; NOTE: Don't use "Flags: ignoreversion" on any shared system files

[Icons]
Name: "{group}\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"
Name: "{group}\{cm:UninstallProgram,{#MyAppName}}"; Filename: "{uninstallexe}"
Name: "{commondesktop}\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"; Tasks: desktopicon
Name: "{userappdata}\Microsoft\Internet Explorer\Quick Launch\{#MyAppName}"; Filename: "{app}\{#MyAppExeName}"; Tasks: quicklaunchicon

[Run]
Filename: "{app}\{#MyAppExeName}"; Description: "{cm:LaunchProgram,{#StringChange(MyAppName, '&', '&&')}}"; Flags: nowait postinstall skipifsilent

