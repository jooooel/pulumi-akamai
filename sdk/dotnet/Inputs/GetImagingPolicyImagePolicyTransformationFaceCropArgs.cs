// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationFaceCropInputArgs : global::Pulumi.ResourceArgs
    {
        [Input("algorithm")]
        public Input<string>? Algorithm { get; set; }

        [Input("algorithmVar")]
        public Input<string>? AlgorithmVar { get; set; }

        [Input("confidence")]
        public Input<string>? Confidence { get; set; }

        [Input("confidenceVar")]
        public Input<string>? ConfidenceVar { get; set; }

        [Input("failGravity")]
        public Input<string>? FailGravity { get; set; }

        [Input("failGravityVar")]
        public Input<string>? FailGravityVar { get; set; }

        [Input("focus")]
        public Input<string>? Focus { get; set; }

        [Input("focusVar")]
        public Input<string>? FocusVar { get; set; }

        [Input("gravity")]
        public Input<string>? Gravity { get; set; }

        [Input("gravityVar")]
        public Input<string>? GravityVar { get; set; }

        [Input("height")]
        public Input<string>? Height { get; set; }

        [Input("heightVar")]
        public Input<string>? HeightVar { get; set; }

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

        public GetImagingPolicyImagePolicyTransformationFaceCropInputArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationFaceCropInputArgs Empty => new GetImagingPolicyImagePolicyTransformationFaceCropInputArgs();
    }
}