# TubuleJ
TubuleJ is a plugin to ImageJ designed to analyze cryo-electron microscope images of fibers. The straightening part of TubuleJ can be used with any type of fiber, while the 3D reconstruction part is specific to microtubules.

## Download

Pre-built `.jar` files are available on the [Releases](https://github.com/dchretien35/TubuleJ/releases) page.

To install, copy `TubuleJ_.jar` into the `plugins` folder of your ImageJ installation and restart ImageJ. The plugin will appear under the **Plugins > TubuleJ** menu.

## Building from source

Requirements: Java 8+, [Apache Maven](https://maven.apache.org/)

```bash
git clone https://github.com/dchretien35/TubuleJ.git
cd TubuleJ
mvn package
```

The compiled plugin jar will be generated at `target/TubuleJ_.jar`.

## License

TubuleJ is released under the [GNU General Public License v3.0](LICENSE).
