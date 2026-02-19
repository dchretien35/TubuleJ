package tubulej;

import ij.IJ;
import ij.ImagePlus;
import ij.plugin.PlugIn;

/**
 * TubuleJ - ImageJ plugin for the analysis of cryo-electron microscope images of fibers.
 *
 * <p>TubuleJ can straighten curved fiber images and perform 3D reconstruction
 * of microtubules.</p>
 *
 * <p>For usage instructions, see the documentation at:
 * https://github.com/dchretien35/TubuleJ</p>
 */
public class TubuleJ_ implements PlugIn {

    @Override
    public void run(String arg) {
        ImagePlus imp = IJ.getImage();
        if (imp == null) {
            IJ.noImage();
            return;
        }
        IJ.showMessage("TubuleJ", "TubuleJ plugin loaded successfully.\n" +
                "Please refer to the documentation for usage instructions.");
    }
}
