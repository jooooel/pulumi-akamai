// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Outputs
{

    [OutputType]
    public sealed class GetImagingPolicyImagePolicyTransformationCompositeImageResult
    {
        public readonly ImmutableArray<Outputs.GetImagingPolicyImagePolicyTransformationCompositeImageBoxImageResult> BoxImages;
        public readonly ImmutableArray<Outputs.GetImagingPolicyImagePolicyTransformationCompositeImageCircleImageResult> CircleImages;
        public readonly ImmutableArray<Outputs.GetImagingPolicyImagePolicyTransformationCompositeImageTextImageResult> TextImages;
        public readonly ImmutableArray<Outputs.GetImagingPolicyImagePolicyTransformationCompositeImageUrlImageResult> UrlImages;

        [OutputConstructor]
        private GetImagingPolicyImagePolicyTransformationCompositeImageResult(
            ImmutableArray<Outputs.GetImagingPolicyImagePolicyTransformationCompositeImageBoxImageResult> boxImages,

            ImmutableArray<Outputs.GetImagingPolicyImagePolicyTransformationCompositeImageCircleImageResult> circleImages,

            ImmutableArray<Outputs.GetImagingPolicyImagePolicyTransformationCompositeImageTextImageResult> textImages,

            ImmutableArray<Outputs.GetImagingPolicyImagePolicyTransformationCompositeImageUrlImageResult> urlImages)
        {
            BoxImages = boxImages;
            CircleImages = circleImages;
            TextImages = textImages;
            UrlImages = urlImages;
        }
    }
}
