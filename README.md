# TubuleJ
TubuleJ is a plugin to ImageJ written in Java, designed to analyze cryo-electron microscope images of fibers. The straightening part of TubuleJ can be used with various types of fibers, while the FFT analysis and 3D reconstruction part is specific to microtubules.
Contact: denis.chretien@univ-rennes.fr / denis.chretien@cnrs.fr / denis.chretien3@gmail.com
# Citing TubuleJ
To cite TubuleJ in your publications, use at least one of the following references:
Blestel, S., Kervrann, C., & Chretien, D. (2009). A Fourier-based method for detecting curved microtubule centers : Application to straightening of cryo-electron microscope images. 2009 IEEE International Symposium on Biomedical Imaging: From Nano to Macro, 298‑301. https://doi.org/10.1109/ISBI.2009.5193043<img width="470" height="59" alt="image" src="https://github.com/user-attachments/assets/9feccba0-888b-416d-858f-21c2995c2edd" />
Ku, S., Messaoudi, C., Guyomar, C., Kervrann, C., & Chrétien, D. (2020). Determination of Microtubule Lattice Parameters from Cryo-electron Microscope Images Using TubuleJ. Bio-Protocol, 10(21), Article 21. https://doi.org/10.21769/BioProtoc.3814<img width="470" height="103" alt="image" src="https://github.com/user-attachments/assets/ce483c7e-9783-4016-b241-0713fa1c4d36" />
# Installation
Download TubuleJ_.jar and install it in the Plugins folder of ImageJ/Fiji. It will be available through Plugins > TubuleJ > TubuleJ.
An image must be opened before launching TubuleJ.
# Aim of TubuleJ
The inteface of TubuleJ contains 10 modules disposed in two columns.

<img width="419" height="179" alt="TubuleJ_interface" src="https://github.com/user-attachments/assets/47b0ce40-8bb0-4997-b363-62c2acbabed8" />

The left modules can be used to straighten various types of fibers (microtubules, actin, filamentous viruses like TMV, ...), while those on the right are more specific to microtubules. Nevertheless, the 'Filter fiber' routine can also be used on other types of fibers providing that their diffraction pattern has been adequatly indexed.

# Tutorial
Download the detailed tutorial:

# History
The scripts underlying TubuleJ were originally written by Denis Chrétien in the 90's (EMBL, Heildeberg, Germany) using the Semper image analysis program (Saxton) that has been discontinued. It's original aim was to semi-automatically straighten cryo-EM images of microtubules to obtain sharp diffraction patterns that could be further analyzed in terms of helical parameters of the microtubule lattice.
It was developped in Java as a plugin to ImageJ by Sophie Blestel (Inria, Rennes, France), giving rise to the first version of TubuleJ with a graphical interface:

Implementation of TomoJ to accelerate 3D reconstructions were implemented by Cedric Messaoudi (Institut Curie, Saclay, France):

The current version (TubuleJ_V2) was simplified by Denis Chrétien in February 2026 (IGDR, Rennes, France), providing a measure of the subunit repeat corrected by the effect of the protofilament skew angle.
