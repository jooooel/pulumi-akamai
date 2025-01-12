// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageArgs : global::Pulumi.InvokeArgs
    {
        [Input("boxImages")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageArgs>? _boxImages;
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageArgs> BoxImages
        {
            get => _boxImages ?? (_boxImages = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageBoxImageArgs>());
            set => _boxImages = value;
        }

        [Input("circleImages")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImageArgs>? _circleImages;
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImageArgs> CircleImages
        {
            get => _circleImages ?? (_circleImages = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageCircleImageArgs>());
            set => _circleImages = value;
        }

        [Input("textImages")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageArgs>? _textImages;
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageArgs> TextImages
        {
            get => _textImages ?? (_textImages = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageTextImageArgs>());
            set => _textImages = value;
        }

        [Input("urlImages")]
        private List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageUrlImageArgs>? _urlImages;
        public List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageUrlImageArgs> UrlImages
        {
            get => _urlImages ?? (_urlImages = new List<Inputs.GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageUrlImageArgs>());
            set => _urlImages = value;
        }

        public GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageArgs Empty => new GetImagingPolicyImagePolicyPostBreakpointTransformationCompositeImageArgs();
    }
}
