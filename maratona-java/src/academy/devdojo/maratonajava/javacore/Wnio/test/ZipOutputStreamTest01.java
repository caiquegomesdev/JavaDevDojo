package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest01 {
    public static void main(String[] args) {
        Path arquivoZip = Paths.get("pasta/arquivo.zip");
        Path arquivosParaZipar = Paths.get("pasta/subpasta1/subsubpasta1");

        zip(arquivoZip, arquivosParaZipar);  // Chamada do método zip()
    }

    private static void zip(Path arquivoZip, Path arquivosParaZipar) {
        try {
            // Criando os diretórios necessários para o arquivo ZIP
            Files.createDirectories(arquivoZip.getParent());

            try (ZipOutputStream zipStream = new ZipOutputStream(Files.newOutputStream(arquivoZip));
                 DirectoryStream<Path> directoryStream = Files.newDirectoryStream(arquivosParaZipar)) {

                for (Path file : directoryStream) {
                    if (Files.isRegularFile(file)) {  // Evita tentar zipar diretórios
                        ZipEntry zipEntry = new ZipEntry(file.getFileName().toString());
                        zipStream.putNextEntry(zipEntry);
                        Files.copy(file, zipStream);
                        zipStream.closeEntry();
                    }
                }
                System.out.println("Arquivo ZIP criado com sucesso em: " + arquivoZip.toAbsolutePath());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
