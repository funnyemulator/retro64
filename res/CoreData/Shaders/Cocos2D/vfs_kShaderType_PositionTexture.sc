�GSN    �˅1��\7,5V'Y 6Nh &[7��H�ah�,yQ�Ű?s@Ł��-�Z�1��p�Jh�e/&2)�w(9J=w���[u��eL��*�W�Zm���ԕvɈ��u2�f[�}u�<�X'��6SS	�,�&M$Z��l�q�Cw���A�4>K��f������z���1ؿ���w:3{�����"6��i}�#8�δď݋=��M����Pa 8�������.h�!z"7����BN����q�Ky&?$������?f��l��=X�JDG�ж���P�*�o�䯑Cף��r��&�n��EA.��`�SYHx�r��E�Ҝ�mh�9��<O�Nf�r��>w;���9�n�R����'M�}a�]���F���%_&���wc�T��K���H��SO��H�.�2��q��M'I)��@��u���|�Ј,L4P��,�^s$��d����~���X����A���T	��ʸm^yr�E`�9�r�p1 ?̗�ܬ$oosition.xyz,1.0));
    v_texCoord = a_texcoord0;
}


#endif

#ifdef FS
$input v_texCoord

#include "../Library/Base/c�mmon.sh"

uniform mat4 CC_PMatrix;
uniform mat4 CC_MultiViewPMatrix[4];
uniform mat4 CC_MVMatrix;
uniform mat4 CC_MVPMatri+;
uniform mat4 CC_MultiViewMVPMatrix[4];
uniform mat3 CC_NormalMatrix;
uniform vec4 CC_Time;
uniform vec4 CC_SinTime;
unif�rm vec4 CC_CosTime;
uniform vec4 CC_Random01;

SAMPLER2D (CC_Texture0,0);




void main()
{
    gl_FragColor = textur2D(CC_Texture0, v_texCoord);
//    gl_FragColor = vec4(v_texCoord.x,v_texCoord.y,0.0,1.0);
}



#endif
