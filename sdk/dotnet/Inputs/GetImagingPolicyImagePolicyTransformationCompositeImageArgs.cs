// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationCompositeImageInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("boxImages")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationCompositeImageBoxImageInputArgs>? _boxImages;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationCompositeImageBoxImageInputArgs> BoxImages
        {
            get => _boxImages ?? (_boxImages = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationCompositeImageBoxImageInputArgs>());
            set => _boxImages = value;
        }

        [Input("circleImages")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationCompositeImageCircleImageInputArgs>? _circleImages;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationCompositeImageCircleImageInputArgs> CircleImages
        {
            get => _circleImages ?? (_circleImages = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationCompositeImageCircleImageInputArgs>());
            set => _circleImages = value;
        }

        [Input("textImages")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationCompositeImageTextImageInputArgs>? _textImages;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationCompositeImageTextImageInputArgs> TextImages
        {
            get => _textImages ?? (_textImages = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationCompositeImageTextImageInputArgs>());
            set => _textImages = value;
        }

        [Input("urlImages")]
        private InputList<Inputs.GetImagingPolicyImagePolicyTransformationCompositeImageUrlImageInputArgs>? _urlImages;
        public InputList<Inputs.GetImagingPolicyImagePolicyTransformationCompositeImageUrlImageInputArgs> UrlImages
        {
            get => _urlImages ?? (_urlImages = new InputList<Inputs.GetImagingPolicyImagePolicyTransformationCompositeImageUrlImageInputArgs>());
            set => _urlImages = value;
        }

        public GetImagingPolicyImagePolicyTransformationCompositeImageInputArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationCompositeImageInputArgs Empty => new GetImagingPolicyImagePolicyTransformationCompositeImageInputArgs();
    }
}