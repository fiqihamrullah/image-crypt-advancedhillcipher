# image-crypt-advancedhillcipher

The program applies the Hill Cipher algorithm and Affine Transform to the original image using the transformation matrix. This program generates transformation matrix, which will be used for encrypting the image. This matrix is randomly generated and invertible.
Firstly, Affine Transform will encrypt original pixel , this involves iterating through each pixel in the image, extracting its RGB values, and turn RGB values into gray level pixel and then applying affine transform encryption. After that , result of affine transform will be encrypted by applying the transformation matrix and hill cipher algorithm. Next, the result of hill cipher will be permutated and then saved as ciphered Image.


