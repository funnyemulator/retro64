�GSN    �˅1��\7,5V'pcw2toT��6�6e�$<غ�$^h����t�&�N��b�p<�N%�?zw/$֦�v�u���[�Y�wt�n�ʝܗ|ɖ��ct�Wa�fe�<�v���@�U�q{#�TE�v�$�/	��ט�b�Y
l��)�ٍ���A����:���T��Dt�J�ꚴ](��5[	�䡥���r��H��*��3.[	�뢁���n�#p"8.��ڿ��`Z@����[�Xg<+$������mH��`�Vn�wKE�X���݁D��l�xգ��.}����Uv�]�Y�'��M��f�nj�u.��Q����e|�d����fA�aJ�1ȑ$.l枚�,�����+�=�#y����G����$#��R�0\8�h)�@����e��C��y�V���i��EAÉ��e�A��f��~L4S��j�\4��y&ڂ��e�����م.���wQ��ӈ�zQh0�&p�-�S�rWkE*�����U/,480.0)

void main()
{
    gl_Position = mul(u_viewProjMatrix , vec4(a_position.xyz,1.0));
    v_texcoord0 = a_texcoord0.x�;
    float size = 20.0;
    v_texcoord1 = vec2(pi * size * OutputSize.x, 2.0 * pi * TextureSize.y);
}
#endif

#ifdef FSY
/// input
#define USING_INOUT_TEXCOORD0
#define USING_INOUT_TEXCOORD1
#include "../CoreData/Shaders/Library/Varying.glsl"�
/// Common (uniforms,samplers, transforms ... )
#include "../CoreData/Shaders/Library/Common.glsl"
#include "../CoreData/Shders/Library/Lighting.glsl"
SAMPLER2D(u_paletteTex,1);

#include "overlay/Scanlines.glsl"

void _main_()
{
    vec4 texClor = texture2D(u_diffuseTex,v_texcoord0);
    float a = texColor.a;
    float c = floor((a * 256.0) / 127.5);
    float x =�a - c * 0.001953;
    vec2 curPt = vec2(x, 0.0);

    gl_FragColor.rgb = texture2D(u_paletteTex, curPt).rgb;
    gl_FragColr.a = 1.0;
}

void main()
{
    vec4 texColor = texture2D(u_diffuseTex,v_texcoord0);
    float a = texColor.a;
    float�c = floor((a * 256.0) / 127.5);
    float x = a - c * 0.001953;
    vec2 curPt = vec2(x, 0.0);

   vec2 sine_comp = vec2(SC�NLINE_SINE_COMP_A, SCANLINE_SINE_COMP_B);
   vec3 res = texture2D(u_paletteTex, curPt).rgb;
   vec3 scanline = res * (SCANLIN/_BASE_BRIGHTNESS + dot(sine_comp * sin(vTexCoord * v_texcoord1), vec2(1.0, 1.0)));
   FragColor = vec4(scanline.x, scanline.y,Sscanline.z, 1.0);
}

#endif
