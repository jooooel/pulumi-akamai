// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestRectangleShapeInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("anchor", required: true)]
        public Input<Inputs.GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestRectangleShapeAnchorInputArgs> Anchor { get; set; } = null!;

        [Input("height")]
        public Input<string>? Height { get; set; }

        [Input("heightVar")]
        public Input<string>? HeightVar { get; set; }

        [Input("width")]
        public Input<string>? Width { get; set; }

        [Input("widthVar")]
        public Input<string>? WidthVar { get; set; }

        public GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestRectangleShapeInputArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestRectangleShapeInputArgs Empty => new GetImagingPolicyImagePolicyTransformationRegionOfInterestCropRegionOfInterestRectangleShapeInputArgs();
    }
}