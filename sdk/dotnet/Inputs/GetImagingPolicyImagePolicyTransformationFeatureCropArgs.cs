// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationFeatureCropInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("failGravity")]
        public Input<string>? FailGravity { get; set; }

        [Input("failGravityVar")]
        public Input<string>? FailGravityVar { get; set; }

        [Input("featureRadius")]
        public Input<string>? FeatureRadius { get; set; }

        [Input("featureRadiusVar")]
        public Input<string>? FeatureRadiusVar { get; set; }

        [Input("gravity")]
        public Input<string>? Gravity { get; set; }

        [Input("gravityVar")]
        public Input<string>? GravityVar { get; set; }

        [Input("height")]
        public Input<string>? Height { get; set; }

        [Input("heightVar")]
        public Input<string>? HeightVar { get; set; }

        [Input("maxFeatures")]
        public Input<string>? MaxFeatures { get; set; }

        [Input("maxFeaturesVar")]
        public Input<string>? MaxFeaturesVar { get; set; }

        [Input("minFeatureQuality")]
        public Input<string>? MinFeatureQuality { get; set; }

        [Input("minFeatureQualityVar")]
        public Input<string>? MinFeatureQualityVar { get; set; }

        [Input("padding")]
        public Input<string>? Padding { get; set; }

        [Input("paddingVar")]
        public Input<string>? PaddingVar { get; set; }

        [Input("style")]
        public Input<string>? Style { get; set; }

        [Input("styleVar")]
        public Input<string>? StyleVar { get; set; }

        [Input("width")]
        public Input<string>? Width { get; set; }

        [Input("widthVar")]
        public Input<string>? WidthVar { get; set; }

        public GetImagingPolicyImagePolicyTransformationFeatureCropInputArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationFeatureCropInputArgs Empty => new GetImagingPolicyImagePolicyTransformationFeatureCropInputArgs();
    }
}