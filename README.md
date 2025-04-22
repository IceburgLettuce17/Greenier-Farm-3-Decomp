# Greenier-Farm-3-Decomp
 A de-compilation of Gameloft's J2ME title from 2013 and a prequel to a series of titles, Green Farm 3. This decomp is based on the launch version (1.0.6) for the Samsung GT-S8000 Jet. The goal is not matching, but deobfuscating and documenting it enough for the code to by readable and logically identical.
# Building
## J2ME Setup (nnproject)
- [Windows](https://nnp.nnchan.ru/wiki/?page=j2medevwin)
- [Linux](https://nnp.nnchan.ru/wiki/?page=j2medevlinux)

You may need to add `ulimit -n 10000` to `KEmulator.sh` and `uei/emulator` if you get an error about memory on Linux. You may also have to set the executable flag of the executables (including the `uei` folder) for KEmulator to be detected as a device by Eclipse.

### Setting up on Eclipse
This part assumes you have followed the tutorial for your system above.

1. Create a new Java ME project
2. Copy the contents of the repo to the project root

3. If needed, create a new Run Configuration (Run > Configurations). You should be able to build and run the game using this configuration.
