// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("boxImages")]
        private InputList<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageInputArgs>? _boxImages;
        public InputList<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageInputArgs> BoxImages
        {
            get => _boxImages ?? (_boxImages = new InputList<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageInputArgs>());
            set => _boxImages = value;
        }

        [Input("circleImages")]
        private InputList<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImageInputArgs>? _circleImages;
        public InputList<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImageInputArgs> CircleImages
        {
            get => _circleImages ?? (_circleImages = new InputList<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImageInputArgs>());
            set => _circleImages = value;
        }

        [Input("textImages")]
        private InputList<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageInputArgs>? _textImages;
        public InputList<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageInputArgs> TextImages
        {
            get => _textImages ?? (_textImages = new InputList<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageInputArgs>());
            set => _textImages = value;
        }

        [Input("urlImages")]
        private InputList<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageUrlImageInputArgs>? _urlImages;
        public InputList<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageUrlImageInputArgs> UrlImages
        {
            get => _urlImages ?? (_urlImages = new InputList<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageUrlImageInputArgs>());
            set => _urlImages = value;
        }

        public GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageInputArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageInputArgs Empty => new GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageInputArgs();
    }
}