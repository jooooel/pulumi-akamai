// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Akamai.Inputs
{

    public sealed class GetImagingPolicyImagePolicyTransformationAspectCropArgs : global::Pulumi.InvokeArgs
    {
        [Input("allowExpansion")]
        public string? AllowExpansion { get; set; }

        [Input("allowExpansionVar")]
        public string? AllowExpansionVar { get; set; }

        [Input("height")]
        public string? Height { get; set; }

        [Input("heightVar")]
        public string? HeightVar { get; set; }

        [Input("width")]
        public string? Width { get; set; }

        [Input("widthVar")]
        public string? WidthVar { get; set; }

        [Input("xPosition")]
        public string? XPosition { get; set; }

        [Input("xPositionVar")]
        public string? XPositionVar { get; set; }

        [Input("yPosition")]
        public string? YPosition { get; set; }

        [Input("yPositionVar")]
        public string? YPositionVar { get; set; }

        public GetImagingPolicyImagePolicyTransformationAspectCropArgs()
        {
        }
        public static new GetImagingPolicyImagePolicyTransformationAspectCropArgs Empty => new GetImagingPolicyImagePolicyTransformationAspectCropArgs();
    }
}